@echo off
setlocal
set "APP_HOME=%~dp0"
set "VERSION=8.13"
if "%GRADLE_USER_HOME%"=="" set "GRADLE_USER_HOME=%USERPROFILE%\.gradle"
set "INSTALL_DIR=%GRADLE_USER_HOME%\manual-wrapper\gradle-%VERSION%"
if not exist "%INSTALL_DIR%\bin\gradle.bat" (
  if not exist "%GRADLE_USER_HOME%\manual-wrapper" mkdir "%GRADLE_USER_HOME%\manual-wrapper"
  set "ZIP=%GRADLE_USER_HOME%\manual-wrapper\gradle-%VERSION%-bin.zip"
  powershell -NoProfile -ExecutionPolicy Bypass -Command "Invoke-WebRequest -Uri 'https://services.gradle.org/distributions/gradle-%VERSION%-bin.zip' -OutFile '%GRADLE_USER_HOME%\manual-wrapper\gradle-%VERSION%-bin.zip'; Expand-Archive -LiteralPath '%GRADLE_USER_HOME%\manual-wrapper\gradle-%VERSION%-bin.zip' -DestinationPath '%GRADLE_USER_HOME%\manual-wrapper' -Force; Remove-Item -LiteralPath '%GRADLE_USER_HOME%\manual-wrapper\gradle-%VERSION%-bin.zip' -Force"
  if errorlevel 1 exit /b 1
)
call "%INSTALL_DIR%\bin\gradle.bat" -p "%APP_HOME%" %*
exit /b %ERRORLEVEL%

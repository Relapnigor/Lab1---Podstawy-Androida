#!/usr/bin/env sh
# Small Gradle bootstrap for this sample project. It downloads Gradle 8.13 if missing.
set -eu
APP_HOME=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
VERSION=8.13
GRADLE_HOME_BASE=${GRADLE_USER_HOME:-"$HOME/.gradle"}
INSTALL_DIR="$GRADLE_HOME_BASE/manual-wrapper/gradle-$VERSION"
if [ ! -x "$INSTALL_DIR/bin/gradle" ]; then
  mkdir -p "$GRADLE_HOME_BASE/manual-wrapper"
  ZIP="$GRADLE_HOME_BASE/manual-wrapper/gradle-$VERSION-bin.zip"
  URL="https://services.gradle.org/distributions/gradle-$VERSION-bin.zip"
  if command -v curl >/dev/null 2>&1; then
    curl -fL "$URL" -o "$ZIP"
  elif command -v wget >/dev/null 2>&1; then
    wget -O "$ZIP" "$URL"
  else
    echo "Do pobrania Gradle wymagany jest curl albo wget." >&2
    exit 1
  fi
  unzip -q -o "$ZIP" -d "$GRADLE_HOME_BASE/manual-wrapper"
  rm -f "$ZIP"
fi
exec "$INSTALL_DIR/bin/gradle" -p "$APP_HOME" "$@"

#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "my_fox_example"
DESCRIPTION = "Demonstrates how to use the playx 3d Scene plugin to show 3d model."
AUTHOR = "Sourcya.io"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77f824c37447c525bd4906692858848b"

SRCREV = "7a780cc69f68f2150c8e260a74cf925fecc3764a"
SRC_URI = "git://github.com/playx-flutter/playx-3d-scene.git;lfs=0;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "my_fox_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "playx-flutter-playx-3d-scene-example-my-fox-example"
FLUTTER_APPLICATION_PATH = "example"

inherit flutter-app

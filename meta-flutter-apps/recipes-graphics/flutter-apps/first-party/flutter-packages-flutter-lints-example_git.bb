#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "example"
DESCRIPTION = "A project that showcases how to enable the recommended lints for Flutter apps, packages, and plugins."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRCREV = "b7b24eaccb6d3adcb32f780c6098941233c00f62"
SRC_URI = "git://github.com/flutter/packages.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-packages-flutter-lints-example"
FLUTTER_APPLICATION_PATH = "packages/flutter_lints/example"

inherit flutter-app

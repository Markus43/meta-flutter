#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "native_platform_example"
DESCRIPTION = "Example project for demoing native ads using platform-specifc code."
AUTHOR = "Goolge Ads"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "9f989d3ea76b0da9300b4cf9e1926a134edbba4c"
SRC_URI = "git://github.com/googleads/googleads-mobile-flutter.git;lfs=0;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "native_platform_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "googleads-flutter-samples-admob-native-platform-example"
FLUTTER_APPLICATION_PATH = "samples/admob/native_platform_example"

inherit flutter-app

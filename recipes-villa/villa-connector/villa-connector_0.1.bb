# Copyright (C) 2016 Josef Raschen <josef@raschen.org>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "villa-connector library"
HOMEPAGE = ""
SECTION = "villaos"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/JosefR/villa-connector.git"
SRCREV = "ea50c18e088967a61b8c182dae09b98208754f94"

DEPENDS = "systemd"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native"

EXTRA_OEMAKE = ""

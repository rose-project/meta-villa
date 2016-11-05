DESCRIPTION = "A simple headless linux image"

IMAGE_FEATURES += "ssh-server-dropbear splash"

LICENSE = "MIT"

inherit core-image

#SRC_URI = "file://${FILE_DIRNAME}/${BPN}.wks"
SRC_URI = "file://${FILE_DIRNAME}/raspberrypi-sdimg.wks \
	file://license_dummy.txt;md5=12345678"
LIC_FILES_CHKSUM = "file://license_dummy.txt;md5=53ce247bd0fbf8732dc8b2bd6d2b3ef3"

WKS_FILES = "raspberrypi-sdimg.wks"

CORE_IMAGE_BASE_INSTALL += "mesa-megadriver"

IMAGE_INSTALL += " \
    weston \
    weston-init \
    weston-examples \
    librps \
"

IMAGE_FSTYPES = "wic.gz"
RM_OLD_IMAGE = "1"

DEPENDS = "parted-native dosfstools-native mtools-native e2fsprogs-native"


IMAGE_ROOTFS_EXTRA_SPACE = "2000"

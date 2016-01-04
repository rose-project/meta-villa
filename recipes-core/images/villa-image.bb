DESCRIPTION = "A simple headless linux image"

IMAGE_FEATURES += "ssh-server-dropbear splash"

LICENSE = "MIT"

inherit core-image

#SRC_URI = "file://${FILE_DIRNAME}/${BPN}.wks"
SRC_URI = "file://${FILE_DIRNAME}/raspberrypi-sdimg.wks"

WKS_FILE = "raspberrypi-sdimg.wks"

IMAGE_INSTALL += " \
    packagegroup-qt5-all \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-video \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-bad-fbdevsink \
    gstreamer1.0-plugins-bad-mpegpsdemux \
"

IMAGE_FSTYPES = "wic.bz2"
RM_OLD_IMAGE = "1"

DEPENDS = "parted-native dosfstools-native mtools-native e2fsprogs-native"


# core-image-minimal is referenced in .wks, so we need its rootfs
# to be ready before our rootfs
do_rootfs[depends] += "core-image-minimal:do_rootfs"

IMAGE_ROOTFS_EXTRA_SPACE = "2000"
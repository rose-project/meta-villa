DESCRIPTION = "A simple headless linux image"

IMAGE_FEATURES += "ssh-server-dropbear splash"

LICENSE = "MIT"

inherit core-image

#SRC_URI = "file://${FILE_DIRNAME}/${BPN}.wks"
SRC_URI = "file://${FILE_DIRNAME}/raspberrypi-sdimg.wks"

WKS_FILES = "raspberrypi-sdimg.wks"

IMAGE_INSTALL += " \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-video \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-bad-fbdevsink \
    gstreamer1.0-plugins-bad-mpegpsdemux \
"

IMAGE_FSTYPES = "wic.gz"
RM_OLD_IMAGE = "1"

DEPENDS = "parted-native dosfstools-native mtools-native e2fsprogs-native"


IMAGE_ROOTFS_EXTRA_SPACE = "2000"

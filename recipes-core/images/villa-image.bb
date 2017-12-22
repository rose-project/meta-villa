DESCRIPTION = "A simple headless linux image"

IMAGE_FEATURES += "ssh-server-dropbear splash"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${FILE_DIRNAME}/${BPN}/COPYING;md5=35088ff006d41b8e2499350c3840d844"

inherit core-image

#SRC_URI = "file://${FILE_DIRNAME}/${BPN}.wks"
SRC_URI = "file://${FILE_DIRNAME}/raspberrypi-sdimg.wks"

WKS_FILES = "raspberrypi-sdimg.wks"

CORE_IMAGE_BASE_INSTALL += "mesa-megadriver"

IMAGE_INSTALL += " \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-video \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-bad-fbdevsink \
    gstreamer1.0-plugins-bad-mpegpsdemux \
    qtbase \
  	cinematicexperience \
    qtmultimedia \
    qtvirtualkeyboard \
    qtdeclarative \
    qtquick1 \ 
    qtquickcontrols \
    qtquickcontrols2 \
"

IMAGE_FSTYPES = "wic.gz"
RM_OLD_IMAGE = "1"

DEPENDS = "parted-native dosfstools-native mtools-native e2fsprogs-native"


IMAGE_ROOTFS_EXTRA_SPACE = "2000"

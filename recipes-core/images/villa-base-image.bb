DESCRIPTION = "A simple headless linux image"

IMAGE_FEATURES += "splash"

inherit core-image

IMAGE_INSTALL += " \
    openssh \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-video \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-bad-fbdevsink \
    gstreamer1.0-plugins-bad-mpegpsdemux \
"

DESCRIPTION = "A simple headless linux image"

IMAGE_FEATURES += "splash"

inherit core-image

CORE_IMAGE_BASE_INSTALL += "mesa-megadriver"

IMAGE_INSTALL += " \
    openssh \
    weston \
    weston-init \
    weston-examples \
    librps \
"

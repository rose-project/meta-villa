DESCRIPTION = "A simple headless linux image"

IMAGE_FEATURES += "splash"

inherit core-image

IMAGE_INSTALL += " \
    openssh \
"

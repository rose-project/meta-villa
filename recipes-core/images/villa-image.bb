DESCRIPTION = "A simple headless linux image"

IMAGE_FEATURES += "ssh-server-dropbear splash"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += ""

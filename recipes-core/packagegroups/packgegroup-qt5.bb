DESCRIPTION = "QT5 Packages"
LICENSE = "MIT"
PR = "r1"

inherit packagegroup

PACKAGES = "\
    packagegroup-qt5-all \
    "

RDEPENDS_packagegroup-qt5-all = "\
    qtbase \
    qtbase-dev \
    qtbase-tools \
    qtbase-plugins \
    qtbase-fonts \
    qtbase-fonts-pfa \
    qtbase-fonts-pfb \
    qtbase-fonts-qpf \
    qtbase-fonts-ttf-dejavu \
    qtbase-fonts-ttf-vera \
    qt3d \
    qt3d-qmlplugins \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtdeclarative-tools \
    qtgraphicaleffects-qmlplugins \
    qtimageformats-plugins \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
    qtsvg \
    qtsvg-plugins \
    qttools \
    qttools-plugins \
    qttools-tools \
    qtconnectivity \
    qtconnectivity-qmlplugins \
    qtenginio \
    qtenginio-qmlplugins \
    qtlocation \
    qtlocation-plugins \
    qtlocation-qmlplugins \
    qtscript \
    qtsensors \
    qtsensors-plugins \
    qtsensors-qmlplugins \
    qtserialport \
    qtsystems \
    qtsystems-qmlplugins \
    qtsystems-tools \
    qtwebsockets \
    qtwebsockets-qmlplugins \
    qtxmlpatterns \
    qtxmlpatterns-tools \
    qtquickcontrols-qmlplugins \
    qtquick1 \
    quitindicators \
    qsiv \
    qtsmarthome \
    quitindicators \
    qt5nmapper \
    quitbattery \
    qt5ledscreen \
    cinematicexperience \
    qt5everywheredemo \
    qt5nmapcarousedemo \
    "

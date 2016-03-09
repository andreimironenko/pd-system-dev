require ${OEBASE}/pd-system/recipes/rr-rtsp-server/rr-rtsp-server.inc

inherit srctree gitver

                 
S = ${FILE_DIRNAME}/${PN}-git
SRCREV = "${GITVER}"
PV = "${GITVER}"
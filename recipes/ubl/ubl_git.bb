require ${OEBASE}/pd-system/recipes/ubl/ubl.inc

inherit srctree gitver
                 
S = ${FILE_DIRNAME}/${PN}-git
SRCREV = "${GITVER}"
PV = "${GITVER}"

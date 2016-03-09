require ${OEBASE}/pd-system/recipes/build-scripts/build-scripts.inc

inherit srctree gitver

PV = ${GITVER}
S  = ${FILE_DIRNAME}/build-scripts-git

require ${OEBASE}/pd-system/recipes/system-configs/system-configs.inc

inherit srctree gitver

PV = ${GITVER}
S  = ${FILE_DIRNAME}/system-configs-git


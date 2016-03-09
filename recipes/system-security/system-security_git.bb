require ${OEBASE}/pd-system/recipes/system-security/system-security.inc

inherit srctree gitver

PV = ${GITVER}
S  = ${FILE_DIRNAME}/system-security-git

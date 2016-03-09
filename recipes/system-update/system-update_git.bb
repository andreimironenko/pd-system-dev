# Configuration files package
RELPKGDIR=${OEBASE}/pd-system/recipes/system-update
require ${RELPKGDIR}/system-update.inc


inherit srctree gitver 

PV = ${GITVER}
S  = ${FILE_DIRNAME}/system-update-git


UBOOT_DIR = "${OEBASE}/pd-system/recipes/u-boot"
require ${UBOOT_DIR}/u-boot-omap3-evm.inc


inherit srctree gitver


PV = ${GITVER}
S  = ${FILE_DIRNAME}/${PN}-git


COMPATIBLE_MACHINE = "dm814x-stib"

UBOOT_DEPLOY_DIR = "${DEPLOY_DIR_IMAGE}/${PV}"

UBOOT_SCRIPTS_DIR = "${UBOOT_DIR}/${MACHINE}"



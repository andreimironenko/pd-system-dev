UBOOT_DIR = "${OEBASE}/pd-system/recipes/u-boot"
require ${UBOOT_DIR}/u-boot-omap3-z3.inc


inherit srctree gitver

PV = ${GITVER}
S  = ${FILE_DIRNAME}/u-boot-omap3-z3-git

COMPATIBLE_MACHINE = "dm814x-z3"

UBOOT_DEPLOY_DIR = "${DEPLOY_DIR_IMAGE}/${PV}"

UBOOT_SCRIPTS_DIR = "${UBOOT_DIR}/${MACHINE}"


UBOOT_MACHINE = "ti8148_evm_config"

UBOOT_NAND_CONFIG = "ti8148_evm_config_nand"
UBOOT_MIN_UART_CONFIG = "ti8148_evm_min_uart"
UBOOT_MIN_NAND_CONFIG = "ti8148_evm_min_nand"

UBOOT_BINARY = "u-boot.bin"
UBOOT_MIN_UART_BINARY = "u-boot.min.uart"
UBOOT_MIN_NAND_BINARY = "u-boot.min.nand"

UBOOT_IMAGE  = "u-boot.bin-${MACHINE}-${PV}-${PR}"
UBOOT_MIN_UART_IMAGE = "u-boot.min.uart-${MACHINE}-${PV}-${PR}"
UBOOT_MIN_NAND_IMAGE = "u-boot.min.nand-${MACHINE}-${PV}-${PR}"

UBOOT_SYMLINK = "u-boot.bin"
UBOOT_MIN_UART_SYMLINK = "u-boot.min.uart"
UBOOT_MIN_NAND_SYMLINK = "u-boot.min.nand"

UBOOT_MAKE_TARGET = "u-boot.ti" 
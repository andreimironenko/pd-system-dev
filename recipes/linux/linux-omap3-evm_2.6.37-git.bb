require ${OEBASE}/pd-system/recipes/linux/linux-omap3-evm.inc


COMPATIBLE_MACHINE = "(dm814x-stib)"


inherit srctree gitver

KVER="2.6.37"
PSPREL="04.04.00.01"

S = ${FILE_DIRNAME}/${PN}-${KVER}-git
PV = ${GITVER}


#FIXME: KVER and PSPREL is hardcoded, it needs to be like these:
#KVER=${PV:1:6}
#PSPREL=${PV:8:19}

SCRIPTS_DIR="${OEBASE}/pd-system/recipes/linux/${PN}-${KVER}-${PSPREL}/${MACHINE}"

#AM: 
# Work around for the problem when the kernel version is not extracted 
# properly in the kernel.bbclass from the git srctree.
export KERNEL_VERSION=${KVER}


do_deploy() {

    install -d ${DEPLOY_DIR_IMAGE}
    install -m 0644 ${KERNEL_OUTPUT} ${DEPLOY_DIR_IMAGE}/${KERNEL_IMAGE_BASE_NAME}.bin
    #package_stagefile_shell ${S}/${KERNEL_OUTPUT}
    #spackage_stagefile_shell ${DEPLOY_DIR_IMAGE}/${KERNEL_IMAGE_BASE_NAME}.bin

    if [ -d "${PKGD}/lib" ]; then
        fakeroot tar -cvzf ${DEPLOY_DIR_IMAGE}/${MODULES_IMAGE_BASE_NAME}.tgz -C ${PKGD} lib
        #package_stagefile_shell ${DEPLOY_DIR_IMAGE}/${MODULES_IMAGE_BASE_NAME}.tgz
    fi

    cd ${DEPLOY_DIR_IMAGE}
    rm -f ${KERNEL_IMAGE_SYMLINK_NAME}.bin
    ln -sf ${KERNEL_IMAGE_BASE_NAME}.bin ${KERNEL_IMAGE_SYMLINK_NAME}.bin
    #package_stagefile_shell ${DEPLOY_DIR_IMAGE}/${KERNEL_IMAGE_SYMLINK_NAME}.bin
}

do_deploy[dirs] = "${S}"
do_deploy[depends] += "fakeroot-native:do_populate_sysroot"

addtask deploy before do_build after do_package


package org.dasein.cloud.azurearm.compute.vm;

import org.dasein.cloud.*;
import org.dasein.cloud.azurearm.AzureArm;
import org.dasein.cloud.compute.*;
import org.dasein.cloud.util.NamingConstraints;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Locale;

/**
 * Created by vmunthiu on 8/10/2015.
 */
public class AzureArmVirtualMachineCapabilities extends AbstractCapabilities<AzureArm> implements VirtualMachineCapabilities {
    public AzureArmVirtualMachineCapabilities(@Nonnull AzureArm provider) {
        super(provider);
    }

    @Override
    public boolean canAlter(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canClone(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canPause(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canReboot(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canResume(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canStart(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canStop(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canSuspend(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canTerminate(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean canUnpause(VmState fromState) throws CloudException, InternalException {
        return false;
    }

    @Override
    public int getMaximumVirtualMachineCount() throws CloudException, InternalException {
        return 0;
    }

    @Override
    public int getCostFactor(VmState state) throws CloudException, InternalException {
        return 0;
    }

    @Nonnull
    @Override
    public String getProviderTermForVirtualMachine(Locale locale) throws CloudException, InternalException {
        return null;
    }

    @Nullable
    @Override
    public VMScalingCapabilities getVerticalScalingCapabilities() throws CloudException, InternalException {
        return null;
    }

    @Nonnull
    @Override
    public NamingConstraints getVirtualMachineNamingConstraints() throws CloudException, InternalException {
        return null;
    }

    @Nullable
    @Override
    public VisibleScope getVirtualMachineVisibleScope() {
        return null;
    }

    @Nullable
    @Override
    public VisibleScope getVirtualMachineProductVisibleScope() {
        return null;
    }

    @Nonnull
    @Override
    public Requirement identifyDataCenterLaunchRequirement() throws CloudException, InternalException {
        return null;
    }

    @Nonnull
    @Override
    public Requirement identifyImageRequirement(@Nonnull ImageClass cls) throws CloudException, InternalException {
        return null;
    }

    @Nonnull
    @Override
    public Requirement identifyPasswordRequirement(Platform platform) throws CloudException, InternalException {
        return null;
    }

    @Nonnull
    @Override
    public Requirement identifyRootVolumeRequirement() throws CloudException, InternalException {
        return null;
    }

    @Nonnull
    @Override
    public Requirement identifyShellKeyRequirement(Platform platform) throws CloudException, InternalException {
        return null;
    }

    @Nonnull
    @Override
    public Requirement identifyStaticIPRequirement() throws CloudException, InternalException {
        return null;
    }

    @Nonnull
    @Override
    public Requirement identifySubnetRequirement() throws CloudException, InternalException {
        return null;
    }

    @Nonnull
    @Override
    public Requirement identifyVlanRequirement() throws CloudException, InternalException {
        return null;
    }

    @Override
    public boolean isAPITerminationPreventable() throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean isBasicAnalyticsSupported() throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean isExtendedAnalyticsSupported() throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean isUserDataSupported() throws CloudException, InternalException {
        return false;
    }

    @Override
    public boolean isUserDefinedPrivateIPSupported() throws CloudException, InternalException {
        return false;
    }

    @Nonnull
    @Override
    public Iterable<Architecture> listSupportedArchitectures() throws InternalException, CloudException {
        return null;
    }

    @Override
    public boolean supportsSpotVirtualMachines() throws InternalException, CloudException {
        return false;
    }

    @Override
    public boolean supportsClientRequestToken() throws InternalException, CloudException {
        return false;
    }

    @Override
    public boolean supportsCloudStoredShellKey() throws InternalException, CloudException {
        return false;
    }

    @Override
    public boolean isVMProductDCConstrained() throws InternalException, CloudException {
        return false;
    }

    @Override
    public boolean supportsAlterVM() {
        return false;
    }

    @Override
    public boolean supportsClone() {
        return false;
    }

    @Override
    public boolean supportsPause() {
        return false;
    }

    @Override
    public boolean supportsReboot() {
        return false;
    }

    @Override
    public boolean supportsResume() {
        return false;
    }

    @Override
    public boolean supportsStart() {
        return false;
    }

    @Override
    public boolean supportsStop() {
        return false;
    }

    @Override
    public boolean supportsSuspend() {
        return false;
    }

    @Override
    public boolean supportsTerminate() {
        return false;
    }

    @Override
    public boolean supportsUnPause() {
        return false;
    }
}

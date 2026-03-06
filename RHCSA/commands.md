# RHCSA Lab Setup Commands

## 1. Virtualization Install
```bash
sudo dnf install @virtualization #Install the "Group" of packages needed for KYM, QEMU and the VIrt-Manager GUI
sudo systemctl enable --now libvirtd #Start and enable the virt service to run every time the pc turn on
sudo usermod -aG libvirt $USER #Add user to the group (skip pwd) need to log out and log back in.
```
## 2. Manual Service Management
```bash
sudo systemctl start libvirtd # Start engine
sudo systemctl stop libvirtd # Stop engine
sudo systemctl status libvirtd # Check for status
```

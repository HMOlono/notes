# Installation commands

Install the "Group" of packages needed for KVM, QEMU and the Virt-Manager GUI  

```bash
sudo dnf install @virtualization

To start and enable the virtualization service every time the computer turn on 

```bash
sudo systemctl enable --now libvirtd

```bash
sudo systemctl start libvirtd # Turn ON
sudo systemctl stop libvirtd # Turn OFF
sudo systemctl status libvirtd # To check the status


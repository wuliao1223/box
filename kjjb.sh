#!/bin/bash

blue(){
    echo -e "\033[34m\033[01m$1\033[0m"
}
green(){
    echo -e "\033[32m\033[01m$1\033[0m"
}
yellow(){
    echo -e "\033[33m\033[01m$1\033[0m"
}
red(){
    echo -e "\033[31m\033[01m$1\033[0m"
}

if [[ -f /etc/redhat-release ]]; then
    release="centos"
    systemPackage="yum"
    systempwd="/usr/lib/systemd/system/"
elif cat /etc/issue | grep -Eqi "debian"; then
    release="debian"
    systemPackage="apt-get"
    systempwd="/lib/systemd/system/"
elif cat /etc/issue | grep -Eqi "ubuntu"; then
    release="ubuntu"
    systemPackage="apt-get"
    systempwd="/lib/systemd/system/"
elif cat /etc/issue | grep -Eqi "centos|red hat|redhat"; then
    release="centos"
    systemPackage="yum"
    systempwd="/usr/lib/systemd/system/"
elif cat /proc/version | grep -Eqi "debian"; then
    release="debian"
    systemPackage="apt-get"
    systempwd="/lib/systemd/system/"
elif cat /proc/version | grep -Eqi "ubuntu"; then
    release="ubuntu"
    systemPackage="apt-get"
    systempwd="/lib/systemd/system/"
elif cat /proc/version | grep -Eqi "centos|red hat|redhat"; then
    release="centos"
    systemPackage="yum"
    systempwd="/usr/lib/systemd/system/"
fi

$systemPackage -y install wget curl
#1
vps_superspeed(){
	wget -qO- --no-check-certificate https://raw.githubusercontent.com/oooldking/script/master/superbench.sh | bash
}
#2
vps_zbench(){
	wget -N --no-check-certificate https://raw.githubusercontent.com/FunctionClub/ZBench/master/ZBench-CN.sh && bash ZBench-CN.sh
}
#3
vps_testrace(){
	wget -O huichong.sh https://raw.githubusercontent.com/wxfyes/bt/master/huichong.sh && bash huichong.sh
}
#4
vps_LemonBenchIntl(){
    curl -fsL https://ilemonra.in/LemonBenchIntl | bash -s fast
}
#5
vps_Cn2GIA(){
    wget -N --no-check-certificate https://raw.githubusercontent.com/wangn9900/testvps/master/return.sh && bash return.sh
}
#6
vps_make-a(){
    wget -P /root -N --no-check-certificate "https://raw.githubusercontent.com/mack-a/v2ray-agent/master/install.sh" && chmod 700 /root/install.sh && /root/install.sh
}
#7
vps_siheyi(){
    bash <(curl -sL https://s.hijk.art/v2ray.sh)
}
#8
vps_ss(){
    wget --no-check-certificate -O shadowsocks-all.sh https://raw.githubusercontent.com/teddysun/shadowsocks_install/master/shadowsocks-all.sh && chmod +x shadowsocks-all.sh && ./shadowsocks-all.sh 2>&1 | tee shadowsocks-all.log
}
#10
vps_bt1(){
   yum install -y wget && wget -O install.sh http://download.bt.cn/install/install_6.0.sh && sh install.sh
}

vps_bt2(){
   wget -O install.sh http://download.bt.cn/install/install-ubuntu_6.0.sh && bash install.sh
}

vps_bt3(){
   wget -O install.sh http://download.bt.cn/install/install-ubuntu_6.0.sh && sudo bash install.sh
}

vps_bt4(){
   curl http://v7.hostcli.com/install/update6.sh|bash
}

vps_bbr1(){
   wget -N --no-check-certificate "https://raw.githubusercontent.com/chiakge/Linux-NetSpeed/master/tcp.sh" && chmod +x tcp.sh && ./tcp.sh
}

vps_bbr2(){
  wget -N --no-check-certificate "https://raw.githubusercontent.com/ylx2016/Linux-NetSpeed/master/tcp.sh" && chmod +x tcp.sh && ./tcp.sh
}
vps_nf(){
  wget -O nf https://github.com/sjlleo/netflix-verify/releases/download/2.6/nf_2.6_linux_amd64 && chmod +x nf && clear && ./nf
}
vps_x-ui(){
  bash <(curl -Ls https://raw.githubusercontent.com/vaxilu/x-ui/master/install.sh)
}
vps_root(){
  bash <(curl -sSL https://raw.githubusercontent.com/wxfyes/Oracle/main/root.sh)
}
vps_trojan(){
  wget https://raw.githubusercontent.com/wxfyes/trojan/master/Trojan.sh && bash Trojan.sh
}
vps_frps(){
  wget https://raw.githubusercontent.com/MvsCode/frps-onekey/master/install-frps.sh -O ./install-frps.sh && chmod 700 ./install-frps.sh && ./install-frps.sh install
}
vps_nps(){
  wget https://github.com/ehang-io/nps/releases/download/v0.26.10/linux_amd64_server.tar.gz && tar -zxvf linux_amd64_server.tar.gz && sudo ./nps install && ./nps start
}
vps_warp(){
  bash <(curl -fsSL git.io/warp.sh) menu
}
vps_gost(){
  wget --no-check-certificate -O gost.sh https://raw.githubusercontent.com/KANIKIG/Multi-EasyGost/master/gost.sh && chmod +x gost.sh && ./gost.sh
}
bt_kx(){
  bash <(curl -sL https://git.io/JDng7)
}
vps_ip(){
  curl ip.p3terx.com
}
vps_openvz(){
  wget --no-cache -O lkl-haproxy.sh https://github.com/mzz2017/lkl-haproxy/raw/master/lkl-haproxy.sh && bash lkl-haproxy.sh
}
rm_ss(){
  ./shadowsocks-all.sh uninstall
}
vps_lmt(){
  bash <(curl -sSL "https://git.io/JswGm")
}
vps_dd(){
	  bash <(curl -sL https://git.io/JDLe5)
}
docker(){
	curl -fsSL https://get.docker.com -o get-docker.sh && sh get-docker.sh && sudo systemctl start docker
}

vps_233(){
	bash <(curl -s -L https://git.io/v2ray.sh)
}
start_menu(){
    clear
	green "=========================================================="
         blue " 本脚本支持：CentOS7+ / Debian9+ / Ubuntu16.04+"
	 blue " 网站：https://m.233hhh.top "
	 blue " 脚本：bash <(curl -sL https://git.io/JMddS) "
	 blue " 或者: wget -N --no-check-certificate https://raw.githubusercontent.com/wuliao1223/kjjb/main/kjjb.sh && bash kjjb.sh "

     blue " 此脚本源于网络，仅仅只是汇聚脚本功能，方便大家使用而已！"
	green "=========================================================="
      red " 脚本测速会大量消耗 VPS 流量，请悉知！"
    green "==========VPS测速========================================="
         yellow " 1. VPS 三网纯测速 "
	 yellow " 3. VPS 回程路由     （四网测试 - 英文显示）"
	 yellow " 4. VPS 快速全方位测速（包含性能、回程、速度 - 英文显示）"
	 yellow " 5. VPS 回程线路测试 （假CN2线路，脚本无法测试）"
	green "==========科学上网一键脚本==============================="
	 yellow " 6. xray8合1一键安装脚本 "
	 yellow " 7. v2ray四合一脚本 "
	 yellow " 8. shadowsocks一键安装脚本 "
	 yellow " 9. x-ui面板一键安装 "
	 yellow " 10. 233v2脚本 "
	green "===================宝塔面板官方脚本======================="
	 yellow " 11. centos系统一键安装 "
	 yellow " 12. debian系统一键安装 "
	 yellow " 13. ubuntu系统一键安装 "
	green "========宝塔面板破解============"
	 yellow " 14. 宝塔破解企业版 一键破解（需先安装官方版再运行此脚本）"
	 yellow " 15. 宝塔开心版 "
	green "===================BBR加速==============================="
	 yellow " 16. BBR一键加速（稳定版）"
	 yellow " 17. BBR一键加速（最新版）"
	 yellow " 18. openvz BBR一键加速 "
	green "====================流媒体检测======================="
	 yellow " 19. 启动Netflix检测脚本 "
	 yellow " 20. 全面流媒体检测 "
	green "===== ====其他工具（KVM架构VPS通用）=========="
	 yellow " 21. 甲骨文一键设置root密码 "
	 yellow " 22. frp内网穿透一键安装 "
	 yellow " 23. NPS内网穿透一键安装 "
	 yellow " 24. Cloudflare WARP 一键配置脚本 "
	 yellow " 25. gost隧道一键中转 "
	 yellow " 26. 查看本机IP "
	 yellow " 27. 卸载shadowsocks"
	 yellow " 28. dd Linux 系统 "
	 yellow " 29. 安装docker "
        red " 0. 退出脚本 "
    echo
    read -p "请输入数字:" num
    case "$num" in
    		1) vps_superspeed ;;
		2) vps_zbench;;
		3) vps_testrace ;;
		4) vps_LemonBenchIntl ;;
		5) vps_Cn2GIA ;;
		6) vps_make-a ;;
		7) vps_siheyi ;;
		8) vps_ss ;;
		9) vps_x-ui ;;
		10) vps_233 ;;
		11) vps_bt1 ;;
		12) vps_bt2 ;;
		13) vps_bt3 ;;
		14) vps_bt4 ;;
		15) bt_kx ;;
		16) vps_bbr1 ;;
		17) vps_bbr2 ;;
		18) vps_openvz ;;
		19) vps_nf ;;
		20) vps_lmt ;;
		21) vps_root ;;
		22) vps_frps ;;
		23) vps_nps ;;
		24) vps_warp ;;
		25) vps_gost ;;
		26) vps_ip ;;
		27) rm_ss ;;
		28) vps_dd ;;
		29) docker ;;
		0)
		exit 0
		;;
		*)
	clear
	echo "请输入正确数字"
	sleep 2s
	start_menu
	;;
    esac
}

start_menu

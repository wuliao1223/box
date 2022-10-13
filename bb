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



# vps性能测试
#1
vps_superspeed(){
	wget -qO- --no-check-certificate https://raw.githubusercontent.com/oooldking/script/master/superbench.sh | bash
}
#2
swspeed(){
	bash <(curl -Lso- https://git.io/Jlkmw)
}
#3
vps_testrace(){
	wget -O huichong.sh https://raw.githubusercontent.com/wxfyes/bt/master/huichong.sh && bash huichong.sh
}

#4
vps_Cn2GIA(){
    wget -N --no-check-certificate https://raw.githubusercontent.com/wangn9900/testvps/master/return.sh && bash return.sh
}
#5
Bench(){
	wget -qO- bench.sh | bash
}
#6
LemonBenchIntl(){
	curl -fsL https://ilemonra.in/LemonBenchIntl | bash -s fast
}
# 科学上网脚本
#7
vps_make-a(){
    wget -P /root -N --no-check-certificate "https://raw.githubusercontent.com/mack-a/v2ray-agent/master/install.sh" && chmod 700 /root/install.sh && /root/install.sh
}
#8
vps_ss(){
    wget --no-check-certificate -O shadowsocks-all.sh https://raw.githubusercontent.com/teddysun/shadowsocks_install/master/shadowsocks-all.sh && chmod +x shadowsocks-all.sh && ./shadowsocks-all.sh 2>&1 | tee shadowsocks-all.log
}
vps_x-ui(){
  bash <(curl -Ls https://raw.githubusercontent.com/vaxilu/x-ui/master/install.sh)
}
vps_233(){
	bash <(curl -s -L https://git.io/v2ray.sh)
}
rm_ss(){
  ./shadowsocks-all.sh uninstall
}
trojan(){
  source <(curl -sL https://git.io/trojan-install)
}
# 宝塔面板
bt_c(){
   yum install -y wget && wget -O install.sh http://download.bt.cn/install/install_6.0.sh && sh install.sh
}

bt_d(){
   wget -O install.sh http://download.bt.cn/install/install-ubuntu_6.0.sh && bash install.sh
}

bt_u(){
   wget -O install.sh http://download.bt.cn/install/install-ubuntu_6.0.sh && sudo bash install.sh
}
# 国际版
bt_abroad(){
	curl -sSO http://www.aapanel.com/script/new_install_en.sh && bash new_install_en.sh forum
}


# BBR 加速
bbr1(){
   wget -N --no-check-certificate "https://raw.githubusercontent.com/chiakge/Linux-NetSpeed/master/tcp.sh" && chmod +x tcp.sh && ./tcp.sh
}
bbr2(){
  wget -N --no-check-certificate "https://raw.githubusercontent.com/ylx2016/Linux-NetSpeed/master/tcp.sh" && chmod +x tcp.sh && ./tcp.sh
}
bbr_openvz(){
  wget --no-cache -O lkl-haproxy.sh https://github.com/mzz2017/lkl-haproxy/raw/master/lkl-haproxy.sh && bash lkl-haproxy.sh
}
# 流媒体
vps_nf(){
  wget -O nf https://github.com/sjlleo/netflix-verify/releases/download/2.6/nf_2.6_linux_amd64 && chmod +x nf && clear && ./nf
}
vps_lmt(){
  bash <(curl -L -s https://raw.githubusercontent.com/lmc999/RegionRestrictionCheck/main/check.sh)
}
lmt(){
	wget -N --no-check-certificate https://raw.githubusercontent.com/wuliao1223/box/main/lmt  && chmod 777 lmt && bash lmt
}
warp_P3terx(){
  bash <(curl -fsSL git.io/warp.sh) menu
}
warp_fscarmen(){
  wget -N https://cdn.jsdelivr.net/gh/fscarmen/warp/menu.sh && bash menu.sh
}


# 其他工具
vps_oracle(){
  bash <(curl -sSL https://raw.githubusercontent.com/wxfyes/Oracle/main/root.sh)
}

vps_frps(){
  wget https://raw.githubusercontent.com/MvsCode/frps-onekey/master/install-frps.sh -O ./install-frps.sh && chmod 700 ./install-frps.sh && ./install-frps.sh install
}
vps_nps(){
  wget https://github.com/ehang-io/nps/releases/download/v0.26.10/linux_amd64_server.tar.gz && tar -zxvf linux_amd64_server.tar.gz && sudo ./nps install && ./nps start
}

vps_gost(){
  wget --no-check-certificate -O gost.sh https://raw.githubusercontent.com/KANIKIG/Multi-EasyGost/master/gost.sh && chmod +x gost.sh && ./gost.sh
}
vps_ehco(){
  bash <(curl -fsSL https://git.io/ehco.sh)
}
vps_ip(){
  curl ip.p3terx.com
}
vps_dd(){
	  bash <(curl -sL https://git.io/JDLe5)
}
docker(){
	curl -fsSL https://get.docker.com -o get-docker.sh && sh get-docker.sh && sudo systemctl start docker
}
firewall(){
	systemctl stop firewalld.service  &&  systemctl disable firewalld.service 
}
update(){
	wget -N --no-check-certificate https://raw.githubusercontent.com/wuliao1223/box/main/bb && chmod -R 777 bb && bash bb
 }
swap(){
	wget https://www.moerats.com/usr/shell/swap.sh && bash swap.sh
}
newdd(){
	wget -N --no-check-certificate  https://raw.githubusercontent.com/wuliao1223/newdd/main/newdd.sh && bash newdd.sh
}
ChangeMirrors(){
	bash <(curl -sSL https://gitee.com/SuperManito/LinuxMirrors/raw/main/ChangeMirrors.sh)
}
start_menu(){
    clear
	green "=========================================================="
         blue " 本脚本支持：CentOS7+ / Debian9+ / Ubuntu16.04+"
	 blue " 网站：https://m.233hhh.top "
     blue " 此脚本源于网络，仅仅只是汇聚脚本功能，方便大家使用而已！"
	green "=========================================================="
      red " 脚本测速会大量消耗 VPS 流量，请悉知！"
    green "==========VPS测速========================================="
         yellow " 1. VPS 三网纯测速 "
	 yellow " 2. 三网测速 "
	 yellow " 3. VPS 回程路由     （四网测试 - 英文显示）"
	 yellow " 5. 秋水Bench.sh脚本 "
	 yellow " 6. 全面测速 "
	green "==========科学上网一键脚本==============================="
	 yellow " 7. make-a 八合1一键安装脚本 "
	 yellow " 8. x-ui面板一键安装 "
	 yellow " 9. 233v2脚本 "
	 yellow " 10. Trojan（Jrohy版）"
	green "===================宝塔面板官方脚本======================="
	 yellow " 13. centos系统一键安装 "
	 yellow " 14. debian系统一键安装 "
	 yellow " 15. ubuntu系统一键安装 "
	 yellow " 16. 宝塔国际版一键安装 "
	green "===================BBR加速==============================="
	 yellow " 19. BBR一键加速（稳定版）"
	 yellow " 20. BBR一键加速（最新版）"
	 yellow " 21. openvz BBR一键加速 "
	green "===============流媒体检测======================="
	 yellow " 22. 启动Netflix检测脚本 "
	 yellow " 23. 流媒体检测脚本一 "
	 yellow " 24. 流媒体检测脚本二 "
	 yellow " 25. warp_fscarmen (美国可用) "
	green "===== ====其他工具（KVM架构VPS通用）=========="
	 yellow " 27. 甲骨文一键设置root密码 "
	 yellow " 28. Frp内网穿透一键安装 "
	 yellow " 29. NPS内网穿透一键安装 "
	 yellow " 30. gost隧道一键中转 "
	 yellow " 32. 查看本机IP "
	 yellow " 33. DD Linux 系统 "
	 yellow " 34. DD linux 魔改版 "
	 yellow " 35. 安装docker "
	 yellow " 36. 关闭Centos7防火墙 "
	 yellow " 37. 一键添加/删除Swap虚拟内存 "
	 yellow " 38. 一键换国内源 "
	 
	 yellow " 66. 更新脚本 "
        red " 0. 退出脚本 "
    echo
    read -p "请输入数字:" num
    case "$num" in
    		1) vps_superspeed ;;
		2) swspeed ;;
		3) vps_testrace ;;
		5) Bench ;;
		6) LemonBenchIntl ;;
		7) vps_make-a ;;
		8) vps_x-ui ;;
		9) vps_233 ;;
		10) trojan ;;
		13) bt_c ;;
		14) bt_d ;;
		15) bt_u ;;
		16) bt_abroad ;;
		19) bbr1 ;;
		20) bbr2 ;;
		21) bbr_openvz ;;
		22) vps_nf ;;
		23) vps_lmt ;;
		24) lmt ;;
		25) warp_fscarmen ;;
		27) vps_oracle ;;
		28) vps_frps ;;
		29) vps_nps ;;
		30) vps_gost ;;
		32) vps_ip ;;
		33) vps_dd ;;
		34) newdd ;;
		35) docker ;;
		36) firewall ;;
		37) swap ;;
		38）ChangeMirrors ;;
		66) update ;;
		0) exit 0 ;;
		*)
	clear
	echo "请输入正确数字"
	sleep 2s
	start_menu
	;;
    esac
} 

start_menu

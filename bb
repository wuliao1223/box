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
#5
backtrace(){
    curl https://raw.githubusercontent.com/zhanghanyun/backtrace/main/install.sh -sSf | sh
}
# 科学上网脚本
#7
vps_make-a(){
    wget -P /root -N --no-check-certificate "https://raw.githubusercontent.com/reeceyng/v2ray-agent/master/install.sh" && chmod 700 /root/install.sh && /root/install.sh
}
#8
vps_ss(){
    wget --no-check-certificate -O shadowsocks-all.sh https://raw.githubusercontent.com/teddysun/shadowsocks_install/master/shadowsocks-all.sh && chmod +x shadowsocks-all.sh && ./shadowsocks-all.sh 2>&1 | tee shadowsocks-all.log
}
vps_x-ui(){
  bash <(curl -Ls https://raw.githubusercontent.com/vaxilu/x-ui/master/install.sh)
}
v2_233(){
	bash <(curl -s -L https://git.io/v2ray.sh)
}
xray_233(){
    bash <(wget -qO- -o- https://github.com/233boy/Xray/raw/main/install.sh) -v v1.8.3
}
rm_ss(){
  ./shadowsocks-all.sh uninstall
}

Naive(){
	curl   https://raw.githubusercontent.com/imajeason/nas_tools/main/NaiveProxy/do.sh | bash
}
# 宝塔面板
bt_all(){
   if [ -f /usr/bin/curl ];then curl -sSO https://download.bt.cn/install/install_panel.sh;else wget -O install_panel.sh https://download.bt.cn/install/install_panel.sh;fi;bash install_panel.sh ed8484bec
}

# 国际版
bt_abroad(){
	curl -sSO http://www.aapanel.com/script/new_install_en.sh && bash new_install_en.sh forum
}
bt_uninstall(){
	wget http://download.bt.cn/install/bt-uninstall.sh && sh bt-uninstall.sh
}
bt_kx(){
	bash <(curl -sL https://git.io/JDng7)
}
xpmb(){
	wget -O install.sh https://notdocker.xp.cn/install.sh && sudo bash install.sh
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

vps_lmt(){
  bash <(curl -Ls unlock.moe)
}
lmt(){
	wget -N --no-check-certificate https://raw.githubusercontent.com/wuliao1223/box/main/lmt  && chmod 777 lmt && bash lmt
}
warp_P3terx(){
  bash <(curl -fsSL git.io/warp.sh) menu
}
warp_fscarmen(){
  wget -N https://raw.githubusercontent.com/fscarmen/warp/main/menu.sh && bash menu.sh 
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
	wget  -N --no-check-certificate https://www.233hhh.top/bb && chmod +x bb  &&  ./bb
 }
swap(){
	wget   -N --no-check-certificate  https://www.moerats.com/usr/shell/swap.sh && bash swap.sh
}
newdd(){
	wget -N --no-check-certificate  https://raw.githubusercontent.com/wuliao1223/newdd/main/newdd.sh && bash newdd.sh
}
ChangeMirrors(){
	bash <(curl -sSL https://gitee.com/SuperManito/LinuxMirrors/raw/main/ChangeMirrors.sh)
}
JiGuang(){
	bash <(curl -fsSL https://raw.githubusercontent.com/Aurora-Admin-Panel/deploy/main/install.sh)
}
start_menu(){
    clear
	green "=========================================================="
         blue " 本脚本支持：CentOS7+ / Debian9+ / Ubuntu16.04+"
	 blue " 网站：https://www.233hhh.top "
     blue " 此脚本源于网络，仅仅只是汇聚脚本功能，方便大家使用而已！"
    green "==========VPS测速========================================="
         yellow " 1. VPS 三网纯测速 "
		 yellow " 2. 秋水Bench.sh脚本 "
	 yellow " 3. 三网测速 "
	 yellow " 4. VPS 回程路由 （四网测试 - 英文显示）"
	 yellow " 5. 回程线路测速（快速）"
	green "==========科学上网一键脚本==============================="
	 yellow " 7. make-a 八合1一键安装脚本 "
	 yellow " 8. x-ui面板一键安装 "
	 yellow " 9. 233v2脚本  "
	 yellow " 10. 233 xray脚本 "
	green "===================Linux面板======================="
	 yellow " 13. 宝塔国内版 "
	 yellow " 14. 宝塔国际版 "
	 yellow " 15. 宝塔开心版 7.7 "
	 yellow " 16. 一键卸载宝塔面板 "
	green "===================BBR加速==============================="
	 yellow " 20. BBR一键加速（稳定版）"
	 yellow " 21. BBR一键加速（最新版）"
	 yellow " 22. openvz BBR一键加速 "
	green "===============流媒体检测======================="
	 yellow " 23. 流媒体检测脚本一 (飞速） "
	 yellow " 24. 流媒体检测脚本二 "
	 yellow " 25. warp_fscarmen （拯救v6小鸡）"
	green "===== ====其他工具（KVM架构VPS通用）=========="
	 yellow " 27. 甲骨文一键设置root密码 "
	 yellow " 28. Frp内网穿透一键安装 "
	 yellow " 30. gost隧道一键中转 "
	 yellow " 31. 极光面板（docker）"
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
		2) Bench ;;
		3) swspeed ;;
		4) vps_testrace ;;
        5) backtrace ;;
		7) vps_make-a ;;
		8) vps_x-ui ;;
		9) v2_233 ;;
		10) xray_233 ;;
		13) bt_all ;;
		14) bt_abroad ;;
		15) bt_kx ;;
		16) bt_uninstall ;;
		20) bbr1 ;;
		21) bbr2 ;;
		22) bbr_openvz ;;
		23) vps_lmt ;;
		24) lmt ;;
		25) warp_fscarmen ;;
		27) vps_oracle ;;
		28) vps_frps ;;
		30) vps_gost ;;
		31) JiGuang ;;
		32) vps_ip ;;
		33) vps_dd ;;
		34) newdd ;;
		35) docker ;;
		36) firewall ;;
		37) swap ;;
		38)ChangeMirrors ;;
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

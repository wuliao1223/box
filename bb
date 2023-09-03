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
Bench(){
	bash <(curl -s -L bit.ly/233bench)
}
#2
swspeed(){
	bash <(curl -Lso- https://git.io/Jlkmw)
}
#3
vps_testrace(){
	wget https://raw.githubusercontent.com/vpsxb/testrace/main/testrace.sh -O testrace.sh && bash testrace.sh  
}

#4
backtrace(){
    curl https://raw.githubusercontent.com/zhanghanyun/backtrace/main/install.sh -sSf | sh
}
#6


# 科学上网脚本


vps_x-ui(){
  bash <(curl -Ls https://raw.githubusercontent.com/vaxilu/x-ui/master/install.sh)
}
x-ui_new(){
	bash <(curl -Ls https://raw.githubusercontent.com/FranzKafkaYu/x-ui/956bf85bbac978d56c0e319c5fac2d6db7df9564/install.sh) 0.3.4.4
}
233v2(){
	wget https://github.com/233boy/v2ray/archive/old.tar.gz -O v2ray-old.tar.gz;tar -zxvf v2ray-old.tar.gz;cd v2ray-old;chmod +x i*;./i* local
}
xray_233(){
    bash <(wget -qO- -o- https://github.com/233boy/Xray/raw/main/install.sh)
}



bt_1(){
   curl -sSO https://raw.githubusercontent.com/8838/btpanel-v7.7.0/main/install/install_panel.sh && bash install_panel.sh
}
bt_2(){
   curl -sSO https://raw.githubusercontent.com/ztkink/bthappy/main/one_key_happy.sh && bash one_key_happy.sh
}
# 国际版
bt_abroad(){
	curl -sSO http://www.aapanel.com/script/new_install_en.sh && bash new_install_en.sh forum
}
bt_uninstall(){
	wget http://download.bt.cn/install/bt-uninstall.sh && sh bt-uninstall.sh
}

JiGuang(){
	bash <(curl -fsSL https://raw.githubusercontent.com/Aurora-Admin-Panel/deploy/main/install.sh)
}

# BBR 加速
bbr2(){
   wget -N --no-check-certificate "https://raw.githubusercontent.com/chiakge/Linux-NetSpeed/master/tcp.sh" && chmod +x tcp.sh && ./tcp.sh
}
bbr1(){
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
	bash <(curl -L -s https://raw.githubusercontent.com/lmc999/RegionRestrictionCheck/main/check.sh)
}

warp(){
  wget -N https://raw.githubusercontent.com/fscarmen/warp/main/menu.sh && bash menu.sh
}


# 其他工具
realm(){
	wget -N --no-check-certificate https://git.io/realm.sh && chmod +x realm.sh && ./realm.sh
}
gost(){
	wget --no-check-certificate -O gost.sh https://raw.githubusercontent.com/KANIKIG/Multi-EasyGost/master/gost.sh && chmod +x gost.sh && ./gost.sh
}
iptable(){
	wget -N --no-check-certificate https://raw.githubusercontent.com/ToyoDAdoubiBackup/doubi/master/iptables-pf.sh && chmod +x iptables-pf.sh && bash iptables-pf.sh
}
vps_oracle(){
  bash <(curl -sSL https://raw.githubusercontent.com/wxfyes/Oracle/main/root.sh)
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
#更新脚本
update(){
	wget -N --no-check-certificate https://raw.githubusercontent.com/wuliao1223/box/main/bb  && chmod 777 bb && bash bb
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

start_menu(){
    clear
	green "=========================================================="
     blue " 本脚本支持：CentOS7+ / Debian9+ / Ubuntu16.04+"
	 blue " 网站：https://www.233hhh.top "
     blue " 以下脚本源于网络，仅仅只是汇聚脚本功能，方便大家使用而已！"
    green "==========VPS测速 && 流媒体检测 ========================="
	yellow " 1. 秋水Bench.sh修改版 "
	 yellow " 2. 三网测速 "
	 yellow " 3. VPS 回程路由 （TCP|ICM|IPV6回程测试）"
	 yellow " 4. 回程线路测速（快速）"
	 yellow " 5. 流媒体检测脚本一 (飞速） "
	 yellow " 6. 流媒体检测脚本二 "
	 yellow " 7. Warp "
	green "==========科学 && BBR 加速==============================="
	 yellow " 8. x-ui面板一键安装 "
	 yellow " 9. x-ui新版（FranzKafkaYu）"
	 yellow " 10. 233 xray脚本 "
	 yellow " 11. BBR一键加速（最新版/吃性能）"
	 yellow " 12. BBR一键加速（原版）"
	 yellow " 13. openvz BBR一键加速 " 
	green "===== ====其他工具====================================="
	 yellow " 15. realm 中专 "
	 yellow " 16. gost 中专 "
	 yellow " 17. iptable 中专 "
	 yellow " 18. 甲骨文一键设置root密码 "
	 yellow " 19. 查看本机IP "
	 yellow " 20. DD Linux 系统 "
	 yellow " 21. 安装docker "
	 yellow " 22. 关闭Centos7防火墙 "
	 yellow " 23. 一键添加/删除Swap虚拟内存 "
	 yellow " 24. 一键换国内源 "
	 yellow " 25. 233v2旧版本 "
	 yellow " 66. 更新脚本 "
        red " 0. 退出脚本 "
    echo
    read -p "请输入数字:" num
    case "$num" in
		1) Bench ;;
		2) swspeed ;;
		3) vps_testrace ;;
		4) backtrace ;;
		5) vps_lmt ;;
		6) lmt ;;
		7) warp ;;

		8) vps_x-ui ;;
		9) x-ui_new ;;
		10) xray_233 ;;
		11) bbr1 ;;		
		12) bbr2 ;;
		13) bbr_openvz ;;

		15) realm ;;
		16) gost ;;
		17) iptable ;;
		18) vps_oracle ;;
		19) vps_ip ;;
		20) vps_dd ;;
		21) docker ;;
		22) firewall ;;
		23) swap ;;
		24) ChangeMirrors ;;
		25) 233v2 ;;
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

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



# 科学上网脚本


x-ui(){
  bash <(curl -Ls https://raw.githubusercontent.com/vaxilu/x-ui/master/install.sh)
}
x-ui_new(){
	bash <(curl -Ls https://raw.githubusercontent.com/FranzKafkaYu/x-ui/master/install.sh)
}

xray_233(){
    bash <(wget -qO- -o- https://github.com/233boy/Xray/raw/main/install.sh)
}
baheyi(){
	wget -P /root -N --no-check-certificate "https://raw.githubusercontent.com/reeceyng/v2ray-agent/master/install.sh" && chmod 700 /root/install.sh && /root/install.sh
}
# Linux 面板部分：
#宝塔7.7原版
bt_1(){
   curl -sSO https://raw.githubusercontent.com/8838/btpanel-v7.7.0/main/install/install_panel.sh && bash install_panel.sh
}
#宝塔7.7版本一键破解
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


# BBR 加速
bbr2(){
   wget -N --no-check-certificate "https://raw.githubusercontent.com/chiakge/Linux-NetSpeed/master/tcp.sh" && chmod +x tcp.sh && ./tcp.sh
}
bbr(){
  wget -N --no-check-certificate "https://raw.githubusercontent.com/ylx2016/Linux-NetSpeed/master/tcp.sh" && chmod +x tcp.sh && ./tcp.sh
}
bbr_openvz(){
  wget --no-cache -O lkl-haproxy.sh https://github.com/mzz2017/lkl-haproxy/raw/master/lkl-haproxy.sh && bash lkl-haproxy.sh
}

# 流媒体

lmt(){
	bash <(curl -Ls unlock.moe)
}
lmt2(){
	bash <(curl -L -s check.unlock.media)
}

warp(){
  wget -N https://gitlab.com/fscarmen/warp/-/raw/main/menu.sh && bash menu.sh
}


# 其他工具
realm(){
	wget -N --no-check-certificate https://git.io/realm.sh && chmod +x realm.sh && ./realm.sh
}
gost(){
	wget --no-check-certificate -O gost.sh https://raw.githubusercontent.com/KANIKIG/Multi-EasyGost/master/gost.sh && chmod +x gost.sh && ./gost.sh
}

vps_ip(){
  curl ip.p3terx.com
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

ChangeMirrors(){
	bash <(curl -sSL https://gitee.com/SuperManito/LinuxMirrors/raw/main/ChangeMirrors.sh)
}

start_menu(){
    clear
	green "=========================================================="
     blue " 本脚本支持：CentOS7+ / Debian9+ / Ubuntu16.04+"
	 blue " 博客： https://www.233hhh.top "
     blue " 以下脚本均源于网络，希望大家喜欢！"
    green "==========VPS测速 && 流媒体检测 ========================="
	 yellow " 1. 秋水Bench.sh修改版 "
	 yellow " 2. 三网测速 "
	 yellow " 3. VPS 回程路由 （TCP|ICM|IPV6回程测试）"
	 yellow " 4. 流媒体检测脚本一 (飞速） "
	 yellow " 5. 流媒体检测脚本二 "
	 yellow " 6. Warp "
	green "==========科学 && BBR 加速==============================="
	 yellow " 8. x-ui "
	 yellow " 9. x-ui 新版（FranzKafkaYu）"
	 yellow " 10. 233 xray脚本 "
	 yellow " 11. BBR一键加速（新版）"
	 yellow " 12. openvz BBR一键加速 " 
#	 yellow " 14. v2-agent 八合一 "
	green "=========其他工具====================================="
	 yellow " 16. realm 中专 "
	 yellow " 17. gost 中专 "
	 yellow " 22. 安装docker "
	 yellow " 23. 一键关闭Centos7防火墙 "
	 yellow " 24. 一键添加/删除Swap虚拟内存 "
	 yellow " 25. 一键换国内源 "
	 red    " 66. 更新脚本 "
 	 red    " 0. 退出脚本 "
    echo
    read -p "请输入数字:" num
    case "$num" in
		1) Bench ;;
		2) swspeed ;;
		3) vps_testrace ;;
		4) lmt ;;
		5) lmt2 ;;
		6) warp ;;

		8) x-ui ;;
		9) x-ui_new ;;
		10) xray_233 ;;
		11) bbr ;;		
		12) bbr_openvz ;;
		14) baheyi ;;

		16) realm ;;
		17) gost ;;
		18) docker ;;
		19) firewall ;;
		20) swap ;;
		21) ChangeMirrors ;;
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

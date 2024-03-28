#!/bin/bash
# ==================================================颜色=========================================================== #
red(){
  echo -e "\033[31m\033[01m$1\033[0m"
}
green(){
  echo -e "\033[32m\033[01m$1\033[0m"
}
yellow(){
  echo -e "\033[33m\033[01m$1\033[0m"
}
blue(){
  echo -e "\033[34m\033[01m$1\033[0m"
}

# ==================================================各种脚本=========================================================== #
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
LemonBench(){
  wget -qO- http://ilemonra.in/LemonBenchIntl | bash -s fast
}

# 流媒体
lmt(){
  bash <(curl -L -s check.unlock.media)
}
lmt2(){
  bash <(curl -Ls unlock.moe)
}
warp(){
  wget -N https://gitlab.com/fscarmen/warp/-/raw/main/menu.sh && bash menu.sh
}


# 科学 && BBR

xray_233(){
  bash <(wget -qO- -o- https://github.com/233boy/Xray/raw/main/install.sh)
}
hy2(){
  wget -N --no-check-certificate https://raw.githubusercontent.com/Misaka-blog/hysteria-install/main/hy2/hysteria.sh && bash hysteria.sh
}
bbr(){
  wget -N --no-check-certificate "https://gist.github.com/zeruns/a0ec603f20d1b86de6a774a8ba27588f/raw/4f9957ae23f5efb2bb7c57a198ae2cffebfb1c56/tcp.sh" && chmod +x tcp.sh && ./tcp.sh  
}
bbr2(){
  wget -N --no-check-certificate "https://raw.githubusercontent.com/ylx2016/Linux-NetSpeed/master/tcp.sh" && chmod +x tcp.sh && ./tcp.sh
}
bbr_openvz(){
 wget --no-cache -O lkl-haproxy.sh https://github.com/mzz2017/lkl-haproxy/raw/master/lkl-haproxy.sh && bash lkl-haproxy.sh
}

# 其他工具
realm(){
  wget -N --no-check-certificate https://git.io/realm.sh && chmod +x realm.sh && ./realm.sh
}
gost(){
  wget --no-check-certificate -O gost.sh https://raw.githubusercontent.com/KANIKIG/Multi-EasyGost/master/gost.sh && chmod +x gost.sh && ./gost.sh
}
docker(){
  curl -fsSL https://get.docker.com -o get-docker.sh && sh get-docker.sh && sudo systemctl start docker
}
firewall(){
  systemctl stop firewalld.service  &&  systemctl disable firewalld.service 
}


update(){
  wget -N --no-check-certificate https://raw.githubusercontent.com/wuliao1223/box/main/bb  && chmod +x bb && bash bb
}

# ================================================== 面板 =========================================================== #
start_menu(){
    clear
     green "==========================================="
     blue " 脚本： bash <(curl -s -L bit.ly/233hhh) "
     blue " 博客： https://www.233hhh.top "
     green "========== VPS测速 && 流媒体检测 ========="
	 yellow " 1. Bench  "
	 yellow " 2. 三网测速 "
	 yellow " 3. VPS 回程路由 "
	 yellow " 4. 流媒体检测 一  "
	 yellow " 5. 流媒体检测 二 "
	 yellow " 6. Warp "
    green "========== 科学 && BBR ========="
	 yellow " 10. 233 xray "
	 yellow " 11. HY2  "
	 yellow " 12. BBR "
	 yellow " 13. BBR2 "
	 yellow " 14. OVZ BBR  "
    green "========= 其他工具 ========="
	 yellow " 15. realm 中专 "
	 yellow " 16. gost 中专 "
	 yellow " 17. 安装docker "
	 yellow " 18. 一键关闭Centos7防火墙 "
	 red    " 66. 更新脚本 "
 	 red    "  0. 退出脚本 "
    echo
    read -p "请输入数字:" num
    case "$num" in

		# VPS测速 && 流媒体检测
		1) Bench ;;
		2) swspeed ;;
		3) vps_testrace ;;
		4) lmt ;;
		5) lmt2 ;;
		6) warp ;;

		#  科学 && BBR

		10) xray_233 ;;
		11) hy2 ;;
		12) bbr ;;
		13) bbr2 ;;
		14) bbr_openvz ;;

		# 其他工具
		15) realm ;;
		16) gost ;;
		17) docker ;;
		18) firewall ;;
		66) update ;;
		 0) exit 0 ;;
		*)
		clear
		echo "请输入正确数字"
		sleep 1s
		start_menu ;;
	esac
}
start_menu

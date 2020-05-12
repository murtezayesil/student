#!/bin/sh

# ██████  ███████ ███████ ██   ██ ████████  ██████  ██████         ██████ ██       ██████   ██████ ██   ██ 
# ██   ██ ██      ██      ██  ██     ██    ██    ██ ██   ██       ██      ██      ██    ██ ██      ██  ██  
# ██   ██ █████   ███████ █████      ██    ██    ██ ██████  █████ ██      ██      ██    ██ ██      █████  
# ██   ██ ██           ██ ██  ██     ██    ██    ██ ██            ██      ██      ██    ██ ██      ██  ██  
# ██████  ███████ ███████ ██   ██    ██     ██████  ██             ██████ ███████  ██████   ██████ ██   ██ 
# Create a tty-clock like looking image for wallpaper

# Dependencies
#   figlet                  to generate fancy text like tty-clock
#       ANSI\ Regular.flf   tty-clock like font type for figlet
#   imagemagick             to generate background image from text
#   feh (optional)          to apply result as desktop background
#=#
# Ubuntu - Pop_OS! - Mint - Debian - Elementary
#       Run `sudo apt install figlet imagemagick feh -y` to install
#=#
# Arch - Manjaro
#       Run `sudo pacman -Syu figlet imagemagick feh` to install

# ███████ ███████ ████████ ██    ██ ██████  
# ██      ██         ██    ██    ██ ██   ██ 
# ███████ █████      ██    ██    ██ ██████  
#      ██ ██         ██    ██    ██ ██      
# ███████ ███████    ██     ██████  ██  

# Copy 'ANSI Regular.flf' into ~/.local/share/figlet directory
# Set below variables according your screen
# Clock size
text_size=20
# Clock color
fg_color=#E0E0E0
# Background color - set to #00000000 for transparent
bg_color=#00000000
# Place a wallpaper.png or jpg to ~/Pictures
# to use an image as background
#   and set bg_color to transparent
bg_image=$HOME/Pictures/wallpaper.png
# Run this script in watch command
# example `watch -n 15 ~/Pictures/desktop-clock/desktop-clock.sh`

#========================================================================#

# Don't change anything below this line
#DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
DIR=$(dirname $(readlink -f $0))

# Get time, generate fancy text and place into a file for imagemagick
echo "text 0,0 '" > $DIR/time
date +%H\:%M | figlet -f $DIR/ANSI\ Regular.flf >> $DIR/time
echo \' >> $DIR/time

# Use convert from imagemagick to convert fancy text to image
convert -size $((20*$text_size))x$((7*$text_size)) xc:$bg_color -font "DejaVu-Sans-Mono" -pointsize $text_size -fill "$fg_color" -draw @$DIR/time $DIR/fancy_time.png

# Place generated clock image onto the middle of wallpaper
composite $DIR/fancy_time.png -gravity center $bg_image $DIR/fancy_wallpaper.png

# Uncomment to apply result as desktop background - optional
#feh --bg-scale $DIR/fancy_wallpaper.png


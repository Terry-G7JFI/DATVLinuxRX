# DATVLinuxRX
Java project, for Linux, to control the Minitioune hardware from Linux. Requires Longmynd to be installed.

Longmynd can be downloaded from
https://github.com/BritishAmateurTelevisionClub/longmynd

DATVLinuxRX project is developed with Netbeans 12

run with
java -jar DATVLinuxRX.jar

In the 'Tune' tab, set the path to longmynd, your desired frequency, symbol rate, which tuner input, then hit tune!
you need to use something like VLC to view the video output, and you set the Video sink IP address and sink port on this
page too.

In VLC try open->network stream
udp://@:10000
for example, and set on the GUI 127.0.0.1 and 10000 for the video sink IP and sink port respectively.

The Info tab will show the running status of the tuner.

Finally, this is really just a proof of concept whether it could be done.
If you'd like to help develop it further, please get in touch

terrysteeper@hotmail.com

What would be nice:
1. Sort the layout managers for the panels so they resize nicely!
2. Develop a nice looking signal strength meter
3. Add an IQ plotter graphic
4. Do some checking for sane input values!
5. Autodetect longmynd installation (should be easy)

I might start doing the above as winter comes and I have more time, but for now "it works enough" to use :-)


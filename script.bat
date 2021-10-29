@echo off

set BUILD_ID=dontKillMe
set JENKINS_NODE_COOKIE=dontKillMe
start /min java -jar target\smartinventory.jar REM UNKNOWN: 
{"type":"Redirect","op":{"text":">","type":"great"},"file":{"text":"/tmp/dimdimlog/log.log",
"type":"Word"}} REM UNKNOWN: {"type":"Redirect","op":{"text":">&","type":"greatand"},"file":
{"text":"1","type":"Word"},"numberIo":{"text":"2","type":"io_number"}}
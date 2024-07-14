@echo off
javac %1
java %~n1 < input.txt > output.txt

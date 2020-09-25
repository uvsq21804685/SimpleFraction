ENABLE_ASSERTIONS=-ea

run: Main 
	java ${ENABLE_ASSERTIONS} Main 

Main: Main.java
	javac Main.java 

clean:
	rm -f *.class
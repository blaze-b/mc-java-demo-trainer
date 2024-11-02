#!/bin/bash

# Set variables
# Whats provided in the system
JRE_HOME="D:\dev\java\jdk8u402-b06"
TOMCAT_HOME="D:/dev/software/apache-tomcat-9.0.91"
WAR_SOURCE="D:/dev/git/mc-java-demo-trainer/mc-spring-mvc/target/mc-spring-demo-mvc.war"
WAR_DESTINATION="$TOMCAT_HOME/webapps/mc-spring-demo-mvc.war"
TOMCAT_START_SCRIPT="$TOMCAT_HOME/bin/startup.sh"
TOMCAT_STOP_SCRIPT="$TOMCAT_HOME/bin/shutdown.sh"
APP_URL="http://localhost:8080/mc-spring-demo-mvc"

# Check if Tomcat is already running
is_tomcat_running() {
    ps aux | grep "$TOMCAT_HOME" | grep -v grep > /dev/null
    return $?
}

# Stop Tomcat if it's running
stop_tomcat() {
    echo "Stopping Tomcat..."
    $TOMCAT_STOP_SCRIPT
    sleep 5
}

# Start Tomcat
start_tomcat() {
    echo "Starting Tomcat..."
    export JRE_HOME
    $JRE_HOME/bin/java -version
    $TOMCAT_START_SCRIPT
    sleep 10
}

# Deploy the WAR file
deploy_war() {
    echo "Deploying WAR file..."
    cp "$WAR_SOURCE" "$WAR_DESTINATION"
    echo "WAR file copied to webapps directory."
}

# Main logic
if is_tomcat_running; then
    echo "Tomcat is already running. Restarting..."
    stop_tomcat
fi

# Deploy and start Tomcat
deploy_war
start_tomcat

# Confirm if the app is running
echo "Checking application status at $APP_URL"
curl -Is "$APP_URL" | head -n 1
echo "Script completed."

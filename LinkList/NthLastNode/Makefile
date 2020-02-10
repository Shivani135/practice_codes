# javac -classpath .:../../junit_jars/junit-4.12.jar TestNthLastNode.java
# java -classpath .:../../junit_jars/junit-4.12.jar:../../junit_jars/hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestNthLastNode

# Give the assignment name here.
ASG_NAME=NthLastNode

# This creates the MainAsgA0154 class name.
MAIN_CLASS=Main$(ASG_NAME)

# This create the TestAsgA0154 class name.
TEST_CLASS=Test$(ASG_NAME)


# This creats the java file name.
MAIN_FILE=$(MAIN_CLASS).java

# This creates the test class file name.
TEST_FILE=$(TEST_CLASS).java


# This is the location of the jar file.
JUNIT_JAR_DIR=../../junit_jars
JUNIT_JAR=$(JUNIT_JAR_DIR)/junit-4.12.jar
HAMCREST_JAR=$(JUNIT_JAR_DIR)/hamcrest-core-1.3.jar

# Make the flags for the javac class.
JUNIT_FLAGS=-classpath .:$(JUNIT_JAR)
JAVADOC_FLAGS=$(JUNIT_FLAGS) -private
JUNIT_RUN_FLAGS=-classpath .:$(JUNIT_JAR):$(HAMCREST_JAR)

JAVADOC_DIR=doc

all:
	javac $(MAIN_FILE)

run: all
	java $(MAIN_CLASS)

test:
	javac $(JUNIT_FLAGS) $(TEST_FILE)

testrun: test
	java $(JUNIT_RUN_FLAGS) org.junit.runner.JUnitCore $(TEST_CLASS)

clean:
	rm *class


javadoc:
	javadoc *.java -d $(JAVADOC_DIR) $(JAVADOC_FLAGS) 


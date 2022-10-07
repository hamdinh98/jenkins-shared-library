#!/usr/bin/env groovy

def call() {
    sh "Building jar file in branch : ${BRANCH_NAME}"
    sh 'mvn package'
}

#!/usr/bin/env groovy

def call() {
    sh 'mvn -Dmaven.test.skip=true clean package'
}

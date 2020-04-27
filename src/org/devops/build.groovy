package org.devops

def Build(buildType,buildShell){
    def buildTools = ["mvn":"M2","ant":"ANT","npm":"NPM","gradle":"GRADLE"]
    println("当前选择的构建类型为 ${buildTools}")
    buildHome tools buildTools[buildType]
    if ("${BuildTools}" == "npm") {
        sh """ 
            export NODE_HOME=${buildHome}
            export PATH=\$NODE_HOME/bin:\$PATH
            ${buildHome}/bin/${buildType} ${buildShell}        
        """
    } else {
        sh "${buildHome}/bin/${buildType}  ${buildShell}
    }
}

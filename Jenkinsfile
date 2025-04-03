pipeline {
    agent any
    tools {
        jdk 'jdk23'
        maven 'maven3'
    }
    environment {
        SCANNER_HOME = tool 'sonar-scanner' // Ensure this tool is correctly configured in Jenkins
        SONAR_HOST_URL = 'http://host.docker.internal:9000'
    }
    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', 
                    credentialsId: '33030154-1857-4168-9dd7-029a1202d3fd', 
                    url: 'https://github.com/sivasree-G/my_sample_project.git'
            }
        }

        stage('Compile Code') {
            steps {
                bat "mvn clean compile -DskipTests=true"
            }
        }

        stage('OWASP Dependency Check') {
            steps {
                dependencyCheck additionalArguments: '--scan ./ --disableAssembly', odcInstallation: 'OWASP-Dependency-Check'
                dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
            }
        }
        
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv("sonar-cube") {  // Ensure "sonar-cube" matches your SonarQube server name in Jenkins
                    bat '''
                    "%SCANNER_HOME%/bin/sonar-scanner" ^
                    -Dsonar.projectName=my_sample_project ^
                    -Dsonar.projectKey=my_sample_project ^
                    -Dsonar.java.binaries=.
                    '''
                }
            }
        }

        stage('Build image') {
            steps {
               withDockerRegistry(credentialsId: 'f1f16ba7-9cf7-4e02-af78-876a9afddd8a', url: 'https://index.docker.io/v1/'
) {  // Removed toolName
                    bat "docker build -t my_sample_project:latest -f Dockerfile ."
                    bat "docker tag my_sample_project sivasreeg/my_sample_project:latest"
                    bat "docker push sivasreeg/my_sample_project:latest"

            }
        }
    }
    
}
}

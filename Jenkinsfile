node('master') 
{
    stage('Continuous Download') 
	{
    git 'https://github.com/Saleem313/SpringBoot-DemoRestApp.git'
	}
    stage('Continuous Build') 
	{
    sh label: '', script: 'mvn package'
	}
}
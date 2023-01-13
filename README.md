# Multi module Android libraries

Simple multi module Android project that contains:

- 📚 Modules defined as Android library.
- ⚙️Common gradle settings such as min/target SDK, version, jvm target, etc.
- 🚀 One task to deploy all modules to local/remote repository.

## Module definition

In the easy way You can provide all dependencies with few lines of code:

```
dependencies {
    // Common dependencies
    with projectDependencies
    // Other
    implementation project(':common')
    ...
```

Or decide if current module should be deployed or not with:

```
with mavenPublisher
```

## Deploy modules

To deploy all modules to repository, type `gradle clean build publishToMavenLocal` in root
directory.
It should create artefacts in Your local repository. You can build artefacts and import it
as `implementation 'com.pk.example.multimodule:feature:1.0.0-SNAPSHOT`.

**Remember to not put Your snapshot dependencies in real development!**

Other:

- Group ID is defined at top of `config.gradle`.
- Artefact name is defined in `gradle.properties` of every module.
- Version is common to every library included in project and defined in root `gradle.properties`
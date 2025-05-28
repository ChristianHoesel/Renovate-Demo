# 36127

Reproduction for [Renovate discussion 36127] (https://github.com/renovatebot/renovate/discussions/36127)

## Current behavior
When a Gradle dependency is specified with a classifier and extension (using the format `group:name:version:classifier@extension`) (https://docs.gradle.org/current/dsl/org.gradle.api.artifacts.dsl.DependencyHandler.html#N174A0). Renovate bot does not properly detect and update this dependency.

## Expected behavior
Renovate recognizes gradle dependencies with classifier and/or extension and makes pr if an update is available.
In this project renovate should update `commons-io:commons-io:2.11.0:sources@jar` in [`project-with-classifier\build.gradle`](project-with-classifier/build.gradle)  

## Link to the Renovate issue or Discussion

[Renovate Discussion 36127](https://github.com/renovatebot/renovate/discussions/36127)

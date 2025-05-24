# Renovate Gradle Issue Demonstration

This repository demonstrates an issue with Renovate bot's handling of dependencies that use classifier notation in Gradle projects.

## Problem Statement

When a Gradle dependency is specified with a classifier and extension (using the format `group:name:version:classifier@extension`), Renovate bot may not properly detect and update this dependency, while it successfully updates the same dependency when specified in the standard format (`group:name:version`).


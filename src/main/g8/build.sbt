name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scalaVersion$"

scalaSource in Compile <<= baseDirectory { (base) => base }
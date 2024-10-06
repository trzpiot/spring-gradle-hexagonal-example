{
  description = "A very basic flake";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs?ref=nixos-unstable";

    snowfall-lib = {
      url = "github:snowfallorg/lib";
      inputs.nixpkgs.follows = "nixpkgs";
    };
  };

  outputs =
    inputs@{ snowfall-lib, ... }:
    snowfall-lib.mkFlake {
      inherit inputs;
      src = ./.;

      snowfall = {
        root = ./nix;
        namespace = "trzpiot";
      };
    };
}

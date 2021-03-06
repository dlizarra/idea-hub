// SystemJS configuration file, see links for more information
// https://github.com/systemjs/systemjs
// https://github.com/systemjs/systemjs/blob/master/docs/config-api.md

/***********************************************************************************************
 * User Configuration.
 **********************************************************************************************/
/** Map relative paths to URLs. */
const map: any = {
  'moment': {
    format: 'cjs'
  },
  'ng2-popover': {
    format: 'cjs'
  },
  'ng2-bs3-modal': {
    format: 'cjs'
  }
};

/** User packages configuration. */
const packages: any = {
};

////////////////////////////////////////////////////////////////////////////////////////////////
/***********************************************************************************************
 * Everything underneath this line is managed by the CLI.
 **********************************************************************************************/
const barrels: string[] = [
  // Angular specific barrels.
  '@angular/core',
  '@angular/common',
  '@angular/compiler',
  '@angular/forms',
  '@angular/http',
  '@angular/router',
  '@angular/platform-browser',
  '@angular/platform-browser-dynamic',

  // Thirdparty barrels.
  'rxjs',
  'ng2-popover',
  'ng2-bs3-modal',

  // App specific barrels.
  'app',
  'app/shared',
  'app/shared/nav',
  'app/shared/nav/header',
  'app/ideas',
  'app/ideas/shared',
  'app/ideas/idea-list',
  'app/ideas/idea-list-item',
  'app/ideas/idea-form',
  'app/users',
  'app/users/shared',
  'app/users/login',
  'app/users/new-user',
  /** @cli-barrel */
];

const cliSystemConfigPackages: any = {};
barrels.forEach((barrelName: string) => {
  cliSystemConfigPackages[barrelName] = { main: 'index' };
});

/** Type declaration for ambient System. */
declare var System: any;

// Apply the CLI SystemJS configuration.
System.config({
  map: {
    '@angular': 'vendor/@angular',
    'rxjs': 'vendor/rxjs',
    'main': 'main.js',
    'moment': 'vendor/moment/moment.js',
    'ng2-popover': 'vendor/ng2-popover',
    'ng2-bs3-modal': 'vendor/ng2-bs3-modal'
  },
  packages: cliSystemConfigPackages
});

// Apply the user's configuration.
System.config({ map, packages });

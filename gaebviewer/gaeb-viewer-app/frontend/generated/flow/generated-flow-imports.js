import '@vaadin/tooltip/src/vaadin-tooltip.js';
import '@vaadin/polymer-legacy-adapter/style-modules.js';
import '@vaadin/button/src/vaadin-button.js';
import 'Frontend/generated/jar-resources/buttonFunctions.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/common-frontend/ConnectionIndicator.js';
import '@vaadin/vaadin-lumo-styles/color-global.js';
import '@vaadin/vaadin-lumo-styles/typography-global.js';
import '@vaadin/vaadin-lumo-styles/sizing.js';
import '@vaadin/vaadin-lumo-styles/spacing.js';
import '@vaadin/vaadin-lumo-styles/style.js';
import '@vaadin/vaadin-lumo-styles/vaadin-iconset.js';

const loadOnDemand = (key) => {
  const pending = [];
  if (key === '31dfa956d1ccda9e1cb7ec8d4609c5d500fa7cbffd173d124a3d13a499da5f77') {
    pending.push(import('./chunks/chunk-31dfa956d1ccda9e1cb7ec8d4609c5d500fa7cbffd173d124a3d13a499da5f77.js'));
  }
  if (key === 'e0a0dadd67b87cca359b97880b0cb0fa193e8cf17f1d16cf6df3f310cb27c710') {
    pending.push(import('./chunks/chunk-e0a0dadd67b87cca359b97880b0cb0fa193e8cf17f1d16cf6df3f310cb27c710.js'));
  }
  if (key === 'd8a5c3ee44eca1f558aa23a9c8b101554639858ca31b9df0e0f5d21671ba8ba9') {
    pending.push(import('./chunks/chunk-d8a5c3ee44eca1f558aa23a9c8b101554639858ca31b9df0e0f5d21671ba8ba9.js'));
  }
  return Promise.all(pending);
}

window.Vaadin = window.Vaadin || {};
window.Vaadin.Flow = window.Vaadin.Flow || {};
window.Vaadin.Flow.loadOnDemand = loadOnDemand;
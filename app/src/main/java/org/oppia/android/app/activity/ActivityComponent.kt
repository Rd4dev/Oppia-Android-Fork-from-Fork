package org.oppia.android.app.activity

import org.oppia.android.app.translation.AppLanguageActivityInjector
import org.oppia.android.app.utility.datetime.DateTimeUtil

/**
 * Root subcomponent for all activities Activity Component.
 *
 * Instances of this subcomponent should be created using [ActivityComponentFactory].
 */
interface ActivityComponent : AppLanguageActivityInjector, DateTimeUtil.Injector

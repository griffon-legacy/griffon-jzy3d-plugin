/*
 * Copyright (c) 2010-2012 Griffon Jzy3d - Andres Almiray. All Rights Reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 *  o Neither the name of Griffon Jzy3d - Andres Almiray nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * @author Andres Almiray
 */
class Jzy3dGriffonPlugin {
    // the plugin version
    String version = '0.3'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = ['jogl': '0.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'BSD'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = ['linux', 'macosx', 'windows']
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-jzy3d-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = "3D charts and plots"
    String description = '''
Provides integration with [Jzy3d][1], a java library for scientific 3D plotting.

Usage
-----

This plugin does not add new nodes to builders, however it adds a new Artifact: `Chart3D`. This artifact may belong
to an MVC group, thus sharing the same context variables as the group, or it can stand on its own. Once you have created
a Chart3D class you can configure it on a group as follows:

__griffon-app/conf/Application.groovy__

		mvcGroups {
			// MVC Group for "sample"
			'sample' {
				model      = 'sample.SampleModel'
				chart3d    = 'sample.SampleChart3D'
				view       = 'sample.SampleView'
				controller = 'sample.SampleController'
			}
		}

It is a good idea to place the `chart3d` member before the View, this way the chart can be referenced from the View and
be displayed correctly, which can be done in this way:

		package sample

		application(title: 'Sample',
				size: [600,600],
				locationByPlatform:true,
				iconImage: imageIcon('/griffon-icon-48x48.png').image,
				iconImages: [imageIcon('/griffon-icon-48x48.png').image,
				imageIcon('/griffon-icon-32x32.png').image,
				imageIcon('/griffon-icon-16x16.png').image]) {
			widget(chart3d.chart.canvas)
		}

### Scripts

 * __create-chart3d__ - creates a new Chart3D class that can participate in an MVC group if configured accordingly


[1]: http://code.google.com/p/jzy3d/
'''
}
